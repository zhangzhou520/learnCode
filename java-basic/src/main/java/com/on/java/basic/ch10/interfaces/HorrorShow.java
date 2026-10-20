package com.on.java.basic.ch10.interfaces;

/**
 * @author zhangzhou
 * @date 2026/10/20 15:25
 **/
public class HorrorShow {

    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}

interface Monster {

    void menace();
}

interface DangerousMonster extends Monster {

    void destroy();
}

interface Lethal {

    void kill();
}

class DragonZilla implements DangerousMonster {


    @Override
    public void destroy() {

    }

    @Override
    public void menace() {

    }
}

interface Vampire extends DangerousMonster, Lethal {

    void drinkBlood();
}

class VeryBadVampire implements Vampire {


    @Override
    public void drinkBlood() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void menace() {

    }
}