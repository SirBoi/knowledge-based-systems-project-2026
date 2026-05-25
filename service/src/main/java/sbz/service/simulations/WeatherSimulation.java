package sbz.service.simulations;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import sbz.model.input.*;
import sbz.model.enums.*;
import sbz.service.EventListener;
import sbz.service.Util;

public class WeatherSimulation {

    public static void run() {

        KieContainer kc = Util.createRuleBase();
        KieSession kSession = Util.getStatefulKnowledgeSession(kc, "basic-simulation");

        kSession.addEventListener(new EventListener());

        Vehicle v = new Vehicle();
        v.setSpeed(90);
        v.setSpeedLimit(80);
        v.setMass(15000);
        v.setLoadLevel(LoadLevel.MEDIUM);
        v.setFrontVehicleDistance(30);
        v.setBrakeCondition(BrakeCondition.NORMAL);
        v.setLightsOn(false);

        Road r = new Road();
        r.setType(RoadType.REGIONAL);
        r.setCondition(RoadConditionType.WET);

        Weather w = new Weather();
        w.setFoggy(true);
        w.setSnowing(false);
        w.setRaining(true);
        w.setDay(false);
        w.setVisibility(VisibilityLevel.LOW);

        Driver d = new Driver();
        d.setContinuousDrivingTime(130);
        d.setHardBrakingCount(0);
        d.setHardAccelerationCount(0);
        d.setDrivingStyle(DrivingStyle.CALM);

        kSession.insert(v);
        kSession.insert(r);
        kSession.insert(w);
        kSession.insert(d);

        int fired = kSession.fireAllRules();
        System.out.println("WeatherSimulation rules fired: " + fired);

        kSession.dispose();
    }
}