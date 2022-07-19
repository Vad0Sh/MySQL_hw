package homework2.task3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ElectricalAppliances> list = new ArrayList<>();
        ElectricalAppliances app1 = new ElectricalAppliances("Computer",500);
        ElectricalAppliances app2 = new ElectricalAppliances("TV",120);
        ElectricalAppliances app3 = new ElectricalAppliances("Stereo",700);
        ElectricalAppliances app4 = new ElectricalAppliances("Blender",500);
        ElectricalAppliances app5 = new ElectricalAppliances("Microwave oven",900);

        list.add(app1);
        list.add(app2);
        list.add(app3);
        list.add(app4);
        list.add(app5);

        int sum =0;
        for (ElectricalAppliances num : list) {
            sum += num.getPower();
            if (num.getPower() >500) {
                System.out.println("Прибор с портребляемой мощностью более полукилловатта: " +num.toString());
            }

        }
        System.out.println("Потребляемая мощность приборов в доме: " +sum+ " ватт");

        Collections.sort(list);
        System.out.println(Arrays.toString(new List[]{list}));
    }
}
