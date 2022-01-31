/*
    Kevin Savill
    9/9/2021
    NetBeans IDE 8.2
    First Draft for Sidecar 2140 pvalue script
*/

package sidecar2140script;

import javax.swing.JOptionPane;
import java.io.*;



public class Sidecar2140Script {
    public static void main(String[] args) throws IOException {
        
        String answer;
        do {

            File file = new File("out.txt");  //created a file object called file
            FileWriter fw = new FileWriter(file, true); //created a FileWriter object called fw
            PrintWriter pw = new PrintWriter(fw);        

            String mpk = JOptionPane.showInputDialog(null,
                    "MPK key?");
            String keyType = JOptionPane.showInputDialog(null,
                    "Key Type: ");
            String keyName = JOptionPane.showInputDialog(null,
                    "Key Description: ");
            String keyValue = JOptionPane.showInputDialog(null,
                    "Key Value: ");

            switch (mpk) {
                case "1":
                    pw.println("P23000=" + keyType + "\n" +
                            "P23001=0\n" +
                            "P23002=" + keyName + "\n" +
                                    "P23003=" + keyValue + "\n");
                    pw.close();
                    break;
                case "2":
                    pw.println("P23005=" + keyType + "\n" +
                            "P23006=0\n" +
                            "P23007=" + keyName + "\n" +
                                    "P23008=" + keyValue + "\n");
                    pw.close();
                    break;
                case "3":
                    pw.println("P23010=" + keyType + "\n" +
                            "P23011=0\n" +
                            "P23012=" + keyName + "\n" +
                                    "P23013=" + keyValue + "\n");
                    pw.close();
                    break;
                case "4":
                    pw.println("P23015=" + keyType + "\n" +
                            "P23016=0\n" +
                            "P23017=" + keyName + "\n" +
                                    "P23018=" + keyValue + "\n");
                    pw.close();
                    break;
                case "5":
                    pw.println("P23020=" + keyType + "\n" +
                            "P23021=0\n" +
                            "P23022=" + keyName + "\n" +
                                    "P23023=" + keyValue + "\n");
                    pw.close();
                    break;
                case "6":
                    pw.println("P23025=" + keyType + "\n" +
                            "P23026=0\n" +
                            "P23027=" + keyName + "\n" +
                                    "P23028=" + keyValue + "\n");
                    pw.close();
                    break;
                case "7":
                    pw.println("P23030=" + keyType + "\n" +
                            "P23031=0\n" +
                            "P23032=" + keyName + "\n" +
                                    "P23033=" + keyValue + "\n");
                    pw.close();
                    break;
                case "8":
                    pw.println("P23035=" + keyType + "\n" +
                            "P23036=0\n" +
                            "P23037=" + keyName + "\n" +
                                    "P23038=" + keyValue + "\n");
                    pw.close();
                    break;
                case "9":
                    pw.println("P23040=" + keyType + "\n" +
                            "P23041=0\n" +
                            "P23042=" + keyName + "\n" +
                                    "P23043=" + keyValue + "\n");
                    pw.close();
                    break;
                case "10":
                    pw.println("P23045=" + keyType + "\n" +
                            "P23046=0\n" +
                            "P23047=" + keyName + "\n" +
                                    "P23048=" + keyValue + "\n");
                    pw.close();
                    break;
                case "11":
                    pw.println("P23050=" + keyType + "\n" +
                            "P23051=0\n" +
                            "P23052=" + keyName + "\n" +
                                    "P23053=" + keyValue + "\n");
                    pw.close();
                    break;
                case "12":
                    pw.println("P23055=" + keyType + "\n" +
                            "P23056=0\n" +
                            "P23057=" + keyName + "\n" +
                                    "P23058=" + keyValue + "\n");
                    pw.close();
                    break;
                case "13":
                    pw.println("P23060=" + keyType + "\n" +
                            "P23061=0\n" +
                            "P23062=" + keyName + "\n" +
                                    "P23063=" + keyValue + "\n");
                    pw.close();
                    break;
                case "14":
                    pw.println("P23065=" + keyType + "\n" +
                            "P23066=0\n" +
                            "P23067=" + keyName + "\n" +
                                    "P23068=" + keyValue + "\n");
                    pw.close();
                    break;
                case "15":
                    pw.println("P23070=" + keyType + "\n" +
                            "P23071=0\n" +
                            "P23072=" + keyName + "\n" +
                                    "P23073=" + keyValue + "\n");
                    pw.close();
                    break;
                case "16":
                    pw.println("P23075=" + keyType + "\n" +
                            "P23076=0\n" +
                            "P23077=" + keyName + "\n" +
                                    "P23078=" + keyValue + "\n");
                    pw.close();
                    break;
                case "17":
                    pw.println("P23080=" + keyType + "\n" +
                            "P23081=0\n" +
                            "P23082=" + keyName + "\n" +
                                    "P23083=" + keyValue + "\n");
                    pw.close();
                    break;
                case "18":
                    pw.println("P23085=" + keyType + "\n" +
                            "P23086=0\n" +
                            "P23087=" + keyName + "\n" +
                                    "P23088=" + keyValue + "\n");
                    pw.close();
                    break;
                case "19":
                    pw.println("P23090=" + keyType + "\n" +
                            "P23091=0\n" +
                            "P23092=" + keyName + "\n" +
                                    "P23093=" + keyValue + "\n");
                    pw.close();
                    break;
                case "20":
                    pw.println("P23095=" + keyType + "\n" +
                            "P23096=0\n" +
                            "P23097=" + keyName + "\n" +
                                    "P23098=" + keyValue + "\n");
                    pw.close();
                    break;
                case "21":
                    pw.println("P23100=" + keyType + "\n" +
                            "P23101=0\n" +
                            "P23102=" + keyName + "\n" +
                                    "P23103=" + keyValue + "\n");
                    pw.close();
                    break;
                case "22":
                    pw.println("P23105=" + keyType + "\n" +
                            "P23106=0\n" +
                            "P23107=" + keyName + "\n" +
                                    "P23108=" + keyValue + "\n");
                    pw.close();
                    break;
                case "23":
                    pw.println("P23110=" + keyType + "\n" +
                            "P23111=0\n" +
                            "P23112=" + keyName + "\n" +
                                    "P23113=" + keyValue + "\n");
                    pw.close();
                    break;
                case "24":
                    pw.println("P23115=" + keyType + "\n" +
                            "P23116=0\n" +
                            "P23117=" + keyName + "\n" +
                                    "P23118=" + keyValue + "\n");
                    pw.close();
                    break;
                case "25":
                    pw.println("P23120=" + keyType + "\n" +
                            "P23121=0\n" +
                            "P23122=" + keyName + "\n" +
                                    "P23123=" + keyValue + "\n");
                    pw.close();
                    break;
                case "26":
                    pw.println("P23125=" + keyType + "\n" +
                            "P23126=0\n" +
                            "P23127=" + keyName + "\n" +
                                    "P23128=" + keyValue + "\n");
                    pw.close();
                    break;
                case "27":
                    pw.println("P23130=" + keyType + "\n" +
                            "P23131=0\n" +
                            "P23132=" + keyName + "\n" +
                                    "P23133=" + keyValue + "\n");
                    pw.close();
                    break;
                case "28":
                    pw.println("P23135=" + keyType + "\n" +
                            "P23136=0\n" +
                            "P23137=" + keyName + "\n" +
                                    "P23138=" + keyValue + "\n");
                    pw.close();
                    break;
                case "29":
                    pw.println("P23140=" + keyType + "\n" +
                            "P23141=0\n" +
                            "P23142=" + keyName + "\n" +
                                    "P23143=" + keyValue + "\n");
                    pw.close();
                    break;
                case "30":
                    pw.println("P23145=" + keyType + "\n" +
                            "P23146=0\n" +
                            "P23147=" + keyName + "\n" +
                                    "P23148=" + keyValue + "\n");
                    pw.close();
                    break;
                case "31":
                    pw.println("P23150=" + keyType + "\n" +
                            "P23151=0\n" +
                            "P23152=" + keyName + "\n" +
                                    "P23153=" + keyValue + "\n");
                    pw.close();
                    break;
                case "32":
                    pw.println("P23155=" + keyType + "\n" +
                            "P23156=0\n" +
                            "P23157=" + keyName + "\n" +
                                    "P23158=" + keyValue + "\n");
                    pw.close();
                    break;
                case "33":
                    pw.println("P23160=" + keyType + "\n" +
                            "P23161=0\n" +
                            "P23162=" + keyName + "\n" +
                                    "P23163=" + keyValue + "\n");
                    pw.close();
                    break;
                case "34":
                    pw.println("P23165=" + keyType + "\n" +
                            "P23166=0\n" +
                            "P23167=" + keyName + "\n" +
                                    "P23168=" + keyValue + "\n");
                    pw.close();
                    break;
                case "35":
                    pw.println("P23170=" + keyType + "\n" +
                            "P23171=0\n" +
                            "P23172=" + keyName + "\n" +
                                    "P23173=" + keyValue + "\n");
                    pw.close();
                    break;
                case "36":
                    pw.println("P23175=" + keyType + "\n" +
                            "P23176=0\n" +
                            "P23177=" + keyName + "\n" +
                                    "P23178=" + keyValue + "\n");
                    pw.close();
                    break;
                case "37":
                    pw.println("P23180=" + keyType + "\n" +
                            "P23181=0\n" +
                            "P23182=" + keyName + "\n" +
                                    "P23183=" + keyValue + "\n");
                    pw.close();
                    break;
                case "38":
                    pw.println("P23185=" + keyType + "\n" +
                            "P23186=0\n" +
                            "P23187=" + keyName + "\n" +
                                    "P23188=" + keyValue + "\n");
                    pw.close();
                    break;
                case "39":
                    pw.println("P23190=" + keyType + "\n" +
                            "P23191=0\n" +
                            "P23192=" + keyName + "\n" +
                                    "P23193=" + keyValue + "\n");
                    pw.close();
                    break;
                case "40":
                    pw.println("P23195=" + keyType + "\n" +
                            "P23196=0\n" +
                            "P23197=" + keyName + "\n" +
                                    "P23198=" + keyValue + "\n");
                    pw.close();
                    break;
                default:
                    System.out.println("Invalid key selected");
                    break;
            }
            answer = JOptionPane.showInputDialog(null,
                    "Configure another key? (y/n)");
        }
        while (answer.equals("y"));

    }
    
}
