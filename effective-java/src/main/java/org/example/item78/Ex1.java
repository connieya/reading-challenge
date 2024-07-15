package org.example.item78;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    private static volatile int nextSerialNumber = 0;

    public static int generateSerialNumber() {
        return nextSerialNumber++;
    }

    public static void main(String[] args) {
        String[] array1 = {
                "X5400", "X5390", "X5380", "X5370", "PPNDT", "M2517", "M2516", "M2515", "M2514", "M2513", "M2512",
                "M2511", "M2510", "M2509", "M2508", "M2507", "M2506", "M2505", "M2504", "M2503", "M2502", "M2501",
                "M105X", "M1050", "M1044", "M1032", "M1031", "M1030", "M1029", "M1028", "M1022", "M1021", "M1020",
                "M1019", "M1016", "M1015", "M1013", "M1010", "M1009", "M1007", "M1006", "M1005", "M1004", "M1003",
                "M1001", "B2516", "B2515", "B2514", "B2513", "B2512", "B2511", "B2510", "B2509", "B2508", "B2507",
                "B2506", "B2505", "B2504", "B2503", "B2502", "B2501", "B1004", "YWAC", "XCH0", "XA77", "XA6X", "XA4C",
                "XA44", "XA43", "XA42", "XA41", "XA3Z", "XA3Y", "XA3X", "XA3V", "XA3S", "XA3R", "XA3Q", "XA3P",
                "XA3O", "XA3M", "XA3L", "X900", "X816", "X814", "X813", "X812", "X811", "X810", "X809", "X801",
                "X793", "X773", "X689", "X688", "X687", "X686", "X685", "X684", "X681", "X680", "X679", "X678",
                "X677", "X676", "X674", "X672", "X671", "X538", "X537", "X456", "X455", "X454", "X453", "X452",
                "X441", "X439", "X438", "X437", "X430", "X429", "X424", "X423", "X422", "X421", "X420", "X419",
                "X417", "X415", "X414", "X412", "X411", "X408", "X407", "X406", "X405", "X404", "X403", "X376",
                "X375", "X374", "X373", "X369", "X368", "X362", "X352", "X339", "X322", "X321", "X320", "X319",
                "X318", "X317", "X315", "X314", "X310", "X309", "X308", "X307", "X306", "X305", "X298", "X289",
                "X288", "X287", "X286", "X285", "X284", "X283", "X282", "X253", "X246", "X235", "X230", "X229",
                "X227", "X226", "X225", "X224", "X222", "X217", "X214", "X213", "X212", "X211", "X210", "X209",
                "X206", "X204", "X203", "X198", "X195", "X194", "X190", "X189", "X188", "X185", "X184", "X182",
                "X176", "X169", "X161", "X146", "X128", "X106", "X105", "X104", "X103", "X082", "X048", "X035",
                "X029", "X028", "W5VV", "W5AC", "W3VV", "W1VV", "W1AC", "UHVV", "U3VV", "U3AC", "U2AC", "U1AC",
                "TUZM", "TTNK", "TEST", "TAAC", "T9AC", "T8AC", "T7AC", "T6AC", "T5AC", "T4AC", "T3AC", "T2AC",
                "T1AC", "RMVJ", "QWVV", "QUVV", "PPND", "PPAC", "PNVV", "PNVP", "PJVP", "OTVJ", "OLVJ", "MTAC",
                "MNTG", "MGAC", "M1VJ", "LGAC", "L3AC", "KYGT", "KXGT", "KWGT", "KVGT", "KUGT", "KTGT", "KSGT",
                "KRGT", "KQGT", "KPGT", "KOGT", "KNGT", "KMP0", "KMGT", "KLGT", "KJGT", "KIGT", "KHGT", "KGGT",
                "KFGT", "KEGT", "KDGT", "KCGT", "KBGT", "KAGT", "JTAC", "JNAC", "IANZ", "IANM", "IANL", "I991",
                "I990", "I982", "I981", "I732", "I731", "I730", "I729", "I641", "I635", "I632", "I621", "I620",
                "I60R", "I601", "I589", "I588", "I534", "I395", "I394", "I391", "I348", "I347", "I341", "I340",
                "I338", "I337", "I281", "I276", "I264", "I251", "I250", "I236", "I235", "I155", "I154", "I153",
                "I152", "I140", "I001", "HAVV", "GSAC", "GQAC", "FWAC", "EACP", "DE04", "CUNE", "C1CC", "C034",
                "BYVV", "AKP9", "ACP9", "A6NE", "TXI", "S50", "RI0", "R90", "R80", "R70", "QR0", "QQ0", "QO0",
                "QN4", "QN3", "QN2", "QN1", "QN0", "PU0", "PR0", "PD0", "MR0", "MF0", "MC0", "K40", "K30", "K20",
                "K10", "HZ0", "HY0", "FF0", "FC1", "FC0", "CU0", "CR0", "CL0", "CH0", "CD1", "CD0", "CA0", "BW0",
                "AL0", "Z7", "Z1", "YG", "YD", "UL", "U7", "TX", "TU", "TB", "PA", "MU", "MS", "KP", "KO", "KN",
                "KM", "KJ", "BG"
        };


        String[] array2 = {
                "X5400", "X5390", "X5380", "X5370", "PPNDT", "M2517", "M2516", "M2515", "M2514", "M2513",
                "M2512", "M2511", "M2510", "M2509", "M2508", "M2507", "M2506", "M2505", "M2504", "M2503",
                "M2502", "M2501", "M105X", "M1050", "M1044", "M1032", "M1031", "M1030", "M1029", "M1028",
                "M1022", "M1021", "M1020", "M1019", "M1016", "M1015", "M1013", "M1010", "M1009", "M1007",
                "M1006", "M1005", "M1004", "M1003", "M1001", "B2516", "B2515", "B2514", "B2513", "B2512",
                "B2511", "B2510", "B2509", "B2508", "B2507", "B2506", "B2505", "B2504", "B2503", "B2502",
                "B2501", "B1004", "YWAC", "XCH0", "XA77", "XA6X", "XA4C", "XA44", "XA43", "XA42", "XA41",
                "XA3Z", "XA3Y", "XA3X", "XA3V", "XA3S", "XA3R", "XA3Q", "XA3P", "XA3O", "XA3M", "XA3L",
                "X900", "X816", "X814", "X813", "X812", "X811", "X810", "X809", "X801", "X793", "X773",
                "X689", "X688", "X687", "X686", "X685", "X684", "X681", "X680", "X679", "X678", "X677",
                "X676", "X674", "X672", "X671", "X538", "X537", "X456", "X455", "X454", "X453", "X452",
                "X441", "X439", "X438", "X437", "X430", "X429", "X424", "X423", "X422", "X421", "X420",
                "X419", "X417", "X415", "X414", "X412", "X411", "X408", "X407", "X406", "X405", "X404",
                "X403", "X376", "X375", "X374", "X373", "X369", "X368", "X362", "X352", "X339", "X322",
                "X321", "X320", "X319", "X318", "X317", "X315", "X314", "X310", "X309", "X308", "X307",
                "X306", "X305", "X298", "X289", "X288", "X287", "X286", "X285", "X284", "X283", "X282",
                "X253", "X246", "X235", "X230", "X229", "X227", "X226", "X225", "X224", "X222", "X217",
                "X214", "X213", "X212", "X211", "X210", "X209", "X206", "X204", "X203", "X198", "X195",
                "X194", "X190", "X189", "X188", "X185", "X184", "X182", "X176", "X169", "X161", "X146",
                "X128", "X106", "X105", "X104", "X103", "X082", "X048", "X035", "X029", "X028", "W5VV",
                "W5AC", "W3VV", "W1VV", "W1AC", "UHVV", "U3VV", "U3AC", "U2AC", "U1AC", "TUZM", "TTNK",
                "TEST", "TAAC", "T9AC", "T8AC", "T7AC", "T6AC", "T5AC", "T4AC", "T3AC", "T2AC", "T1AC",
                "RMVJ", "QWVV", "QUVV", "PPND", "PPAC", "PNVV", "PNVP", "PJVP", "OTVJ", "OLVJ", "MTAC",
                "MNTG", "MGAC", "M1VJ", "LGAC", "L3AC", "KYGT", "KXGT", "KWGT", "KVGT", "KUGT", "KTGT",
                "KSGT", "KRGT", "KQGT", "KPGT", "KOGT", "KNGT", "KMP0", "KMGT", "KLGT", "KJGT", "KIGT",
                "KHGT", "KGGT", "KFGT", "KEGT", "KDGT", "KCGT", "KBGT", "KAGT", "JTAC", "JNAC", "IANZ",
                "IANM", "IANL", "I991", "I990", "I982", "I981", "I732", "I731", "I730", "I729", "I641",
                "I635", "I632", "I621", "I620", "I60R", "I601", "I589", "I588", "I534", "I395", "I394",
                "I391", "I348", "I347", "I341", "I340", "I338", "I337", "I281", "I276", "I264", "I251",
                "I250", "I236", "I235", "I155", "I154", "I153", "I152", "I140", "I001", "HAVV", "GSAC",
                "GQAC", "FWAC", "EACP", "DE04", "CUNE", "C1CC", "C034", "BYVV", "AKP9", "ACP9", "A6NE",
                "TXI", "S50", "RI0", "R90", "R80", "R70", "QR0", "QQ0", "QO0", "QN4", "QN3", "QN2", "QN1",
                "QN0", "PU0", "PR0", "PD0", "MR0", "MF0", "MC0", "K40", "K30", "K20", "K10", "HZ0", "HY0",
                "FF0", "FC1", "FC0", "CU0", "CR0", "CL0", "CH0", "CD1", "CD0", "CA0", "BW0", "AL0", "Z7",
                "Z1", "YG", "YD", "UL", "U7", "TX", "TU", "TB", "PA", "MU", "MS", "KP", "KO", "KN", "KM",
                "KJ", "BG"
        };
        Arrays.sort(array1);
        Arrays.sort(array2);
        boolean flag = true;

        for (int i=0; i< array1.length; i++){
            if (!array1[i].equals(array2[i])){
                flag = false;
                break;
            }
        }

        System.out.println("flag = " + flag);
        
        String a = "057FC0H*000000002024063001301820240629000100000000000001";
        System.out.println("a.length() = " + a.length());
    }
}
