package sbz.service.simulations;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import sbz.model.input.Vehicle;
import sbz.model.input.Road;
import sbz.model.input.Weather;
import sbz.model.input.Driver;
import sbz.model.enums.*;
import sbz.model.events.*;
import sbz.service.EventListener;
import sbz.service.Util;

public class CEPSimulation {
    public static void run() {

        KieContainer kc = Util.createRuleBase();
        KieSession kSession = Util.getStatefulKnowledgeSession(kc, "basic-simulation");

        kSession.addEventListener(new EventListener());

        Vehicle v = new Vehicle();
        v.setSpeed(95);
        v.setSpeedLimit(80);
        v.setMass(18000);
        v.setFrontVehicleDistance(10);
        v.setBrakeCondition(BrakeCondition.NORMAL);
        v.setLightsOn(false);

        Road r = new Road();
        r.setType(RoadType.HIGHWAY);
        r.setCondition(RoadConditionType.DRY);
        r.setSlope(0);

        Weather w = new Weather();
        w.setDay(false);
        w.setFoggy(true);
        w.setVisibility(VisibilityLevel.LOW);

        Driver d = new Driver();
        d.setContinuousDrivingTime(130);
        d.setTotalDailyDrivingTime(9);

        long now = System.currentTimeMillis();

        kSession.insert(v);
        kSession.insert(r);
        kSession.insert(w);
        kSession.insert(d);

        kSession.insert(new HardBrakingEvent(now - 5000));
        kSession.insert(new HardBrakingEvent(now - 3000));
        kSession.insert(new HardBrakingEvent(now - 1000));

        kSession.insert(new SpeedingEvent(now - 25000));
        kSession.insert(new SpeedingEvent(now - 20000));
        kSession.insert(new SpeedingEvent(now - 15000));

        kSession.insert(new SpeedVariationEvent(now - 55000));
        kSession.insert(new SpeedVariationEvent(now - 45000));
        kSession.insert(new SpeedVariationEvent(now - 35000));
        kSession.insert(new SpeedVariationEvent(now - 25000));

        kSession.insert(new DriverRestEvent(now - 3_000_000));

        int fired = kSession.fireAllRules();
        System.out.println("CEPSimulation rules fired: " + fired);

        kSession.dispose();
    }
}