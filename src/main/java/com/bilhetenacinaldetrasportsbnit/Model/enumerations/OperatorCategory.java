package com.bilhetenacinaldetrasportsbnit.Model.enumerations;

public enum  OperatorCategory {
    AIR,
    MARITIME,
    TERRESTRIAL;

    public OperatorCategory getCategoryByNAme(String nameCategory){
        return switch (nameCategory) {
            case "Aéreo" -> OperatorCategory.AIR;
            case "Terreste" -> OperatorCategory.TERRESTRIAL;
            case "Marítimo" -> OperatorCategory.MARITIME;
            default -> null;
        };
    }
}
