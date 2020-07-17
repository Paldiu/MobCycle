package dev.coomware.util;

public class TypeCycler extends GUIMenu {
    public TypeCycler() {
        super(18, "Variant Selector");
    }

    public static class SubTypes extends GUIMenu {
        public SubTypes() {
            super(18, "Sub Types");
        }
    }

    public static class Pattern extends GUIMenu {
        public Pattern() { super(18, "Pattern Color"); }
    }

    public static class Body extends GUIMenu {
        public Body() { super(18, "Body Color"); }
    }

    public static class MainGene extends GUIMenu {
        public MainGene() { super(9, "Main Gene"); }
    }

    public static class HiddenGene extends GUIMenu {
        public HiddenGene() { super(9, "Hidden Gene"); }
    }

    public static class Professions extends GUIMenu {
        public Professions() { super(18, "Professions"); }
    }

}
