
package calc;

public enum Romans {
    I (1),II (2),III (3),IV (4), V (5),VI (6),VII (7),VIII (8),IX (9),X (10),
    XI (11),XII (12),XIII (13),XIV (14),XV (15),XVI (16),XVII (17),XVIII (18),
    XIX (19), XX (20),XXI (21),XXII (22),XXIII (23),XXIV (24),XXV (25),
    XXVI (26),XXVII(27),XXVIII (28),XXIX (29),XXX (30),XXXI (31),XXXII (32),
    XXXIII (33),XXXIV (34),XXXV (35),XXXVI (36),XXXVII (37), XXXVIII (38),
    XXXIX (39), XL (40), XXXXI (41), XXXXII (42),XXXXIII (43),XXXXIV (44),
    XXXXV (45), XXXXVI(46), XXXXVII (47), XXXXVIII (48),XXXXIX (49), L (50),
    LI (51),LII (52), LIII (53), LIV (54), LV (55), LVI (56), LVII (57),
    LVIII (58), LIX (59), LX (60), LXI(61), LXII (62), LXIII (63), LXIV (64),
    LXV (65), LXVI (66), LXVII (67),LXVIII (68),LXIX (69), LXX (70), LXXI (71),
    LXXII (72), LXXIII (73), LXXIV (74),LXXV (75),LXXVI (76),LXXVII (77),
    LXXVIII (78), LXXIX (79), LXXX (80), LXXXI (81), LXXXII (82), LXXXIII (83),
    LXXXIV (84), LXXXV (85), LXXXVI (86), LXXXVII (87), LXXXVIII (88),
    LXXXIX (89), XC (90), XCI (91), XCII (92), XCIII (93),XCIV (94), XCV (95),
    XCVI (96), XCVII (97), XCVIII (98), XCIX (99), C (100);

    static String getVolue(int value) {
        for(Romans item: Romans.values()){
            if(value == item.value){
                return item.name();
            }
        } return "";
      
    }

   
        
    private final int value;
    Romans(int value){
    this.value=value;
}
  
    public int getValue(){
    return value;
}
    static public boolean isRomans(String value){
        for(Romans item: Romans.values()){
            if(item.toString().equals(value) && item.ordinal() < 10)
                return true;
        }
        return false;
    }
    
    static public String getValue(int value){
        for(Romans item: Romans.values()){
            if(item.value == value){
                return item.name();
            }
        }
        return "";
    }
    
    static public int getNumber(String value){
        for(Romans item: Romans.values()){
            if(item.name().equals(value)){
                return item.getValue();
            }
        }
        return 0;
    }
}

 