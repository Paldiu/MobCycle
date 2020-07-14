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
}
