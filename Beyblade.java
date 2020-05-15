/**
 * Beyblade.java holds all the setters and getters of the beyblades
 * from the csv file in order to receive specific info from the Beyblades
 */
public class Beyblade implements BeySpecifics {
    private String type, name, layerSystem, specAttk1, specAttk2, specAttk3, boost;
    private int beyCode,attackLevel, defenseLevel, staminaLevel, specAttkP1, specAttkP2, specAttkP3;
//default constructor
    public Beyblade() {
        type = "";
        name = "";
        layerSystem = "";
        specAttk1 = "";
        specAttk2 = "";
        specAttk3 = "";
        attackLevel = 0;
        defenseLevel = 0;
        staminaLevel = 0;
        beyCode = 0;
        specAttkP1 = 0;
        specAttkP2 = 0;
        specAttkP3 = 0;
        boost = "";

    }
// constructor to help with setting and getting values
    public Beyblade(int beyNum, String nameOfBey, String layerSys, int attackLvl, int defenseLvl, int staminaLvl, String typeOfBey, String specMove1, String specMove2, String specMove3
            , int specPower1, int specPower2, int specPower3, String secretBoost) {
        type = typeOfBey;
        name = nameOfBey;
        layerSystem = layerSys;
        attackLevel = attackLvl;
        defenseLevel = defenseLvl;
        staminaLevel = staminaLvl;
        beyCode = beyNum;
        specAttk1 = specMove1;
        specAttk2 = specMove2;
        specAttk3 = specMove3;
        specAttkP1 = specPower1;
        specAttkP2 = specPower2;
        specAttkP3 = specPower3;
        boost = secretBoost;
    }


    public void setName(String nameOfBey) {
        name = nameOfBey;
    }
//name
    public String getName() {
        return name;
    }

    public void setType(String typeOfBey) {
        type = typeOfBey;
    }
//type
    public String getType() {
        return type;
    }

    public void setLayerSystem(String layerSys) {
        layerSystem = layerSys;
    }
//type of Layer System
    public String getLayerSystem() {
        return layerSystem;
    }

    public void setAttackLevel(int attackLvl) {
        attackLevel = attackLvl;
    }
// attack level
    public int getAttackLevel() {
        return attackLevel;
    }

    public void setDefenseLevel(int defenseLvl) {
        defenseLevel = defenseLvl;
    }
//defense level
    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setStaminaLevel(int staminaLvl) {
        staminaLevel = staminaLvl;
    }
//stamina level
    public int getStaminaLevel() {
        return staminaLevel;
    }

    public void setBeyCode(int beyNum) {
        beyCode = beyNum;
    }
//BEYCODE OR BEYNUMBER
    public int getBeyCode() {
        return beyCode;
    }

    public void setSpecAttk1(String specMove1) {
        specAttk1 = specMove1;
    }
//specialattack level - BASIC
    public String getSpecAttk1() {
        return specAttk1;
    }

    public void setSpecAttk2(String specMove2) {
    }
//specialattack level - INTERMEDIATE
    public String getSpecAttk2() {
        return specAttk2;
    }

    public void setSpecAttk3(String specMove3) {
    }
//specialattack level - ADVANCED
    public String getSpecAttk3() {
        return specAttk3;
    }

    public void setSpecAttkP1(int specPower1) {
        specAttkP1 = specPower1;
    }
    //specialattack power - BASIC
    public int getSpecAttkP1() {
        return specAttkP1;
    }

    public void setSpecAttkP2(int specPower2) {
        specAttkP2 = specPower2;
    }
    //specialattack power - INTERMEDIATE
    public int getSpecAttkP2() {
        return specAttkP2;
    }

    public void setSpecAttkP3(int specPower3) {
        specAttkP3 = specPower3;
    }
    //specialattack power - ADVANCED
    public int getSpecAttkP3() {
        return specAttkP3;
    }

    public void setBoost(String secretBoost) {
        boost = secretBoost;
    }
//boost
    public String getBoost() {
        return boost;
    }

    /**
     *
     * @param totalSpecialAttackPower
     * from the BeySpecifics interface
     * @return
     */
    @Override
    public int specialAttackPower(int totalSpecialAttackPower) {
        if (specAttkP1 == 1) {

            return 1;
        } else if (specAttkP2 == 2) {
            return 3;
        } else if (specAttkP3 == 3) {
            return 6;
        } else {
            return 0;
        }


    }

    /**
     *
     * @param containsSpecialMove
     * from the Beyspecifics interface
     * @return
     */
    @Override
    public String specialMove(String containsSpecialMove) {
        if (specAttkP1 == 1) {
            containsSpecialMove = getSpecAttk1();

            return containsSpecialMove;
        } else if (specAttkP2 == 2) {
            containsSpecialMove = getSpecAttk2();
            return containsSpecialMove;
        } else if (specAttkP3 == 3) {
            containsSpecialMove = getSpecAttk3();
            return containsSpecialMove;
        } else {
            return "This Beyblade has NO special attack moves that it currently can perform. Please try another Beyblade.";
        }

    }

    /**
     *
     * @param hasBooster
     * from the Beyspecifics Interface
     * @return
     */
    @Override
    public boolean beyBooster(boolean hasBooster) {
        if (boost ==  "yes" ) {
            System.out.println("This Beyblade has a booster according to our archives");
            hasBooster = true;

            return hasBooster;
        } else {
            hasBooster = false;
            System.out.println("This Beyblade has no current booster available. Please try another Beyblade.");
            return hasBooster;
        }

    }
}


