package program;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class program {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Dorel").setDeschideUsile(false);

        Autobuz autobuz1 = autobuzBuilder.build();
        Autobuz autobuz2 = new AutobuzBuilder().setNumeSofer("Bobita")
                .setOraIncepereProgram(7).setNrLinie(3).build();

        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
    }
}
