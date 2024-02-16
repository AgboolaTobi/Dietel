package chapter15.bank;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String location = "C:\\Users\\Dell\\IdeaProjects\\agboolaTobi\\src\\chapter15\\bank\\Transaction.txt";
        List<Transaction> listOfTransactions = new ArrayList<>();
        listOfTransactions.add(new Transaction("Isreal", "Delighted", BigDecimal.valueOf(5000).toString()));
        listOfTransactions.add(new Transaction("Toby", "Delighted", BigDecimal.valueOf(5000).toString()));
        listOfTransactions.add(new Transaction("Shola", "Delighted", BigDecimal.valueOf(5000).toString()));
        writeTransaction(listOfTransactions, location);
    }


    private static void writeTransaction(List<Transaction> transactions, String fileLocation){
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileLocation)){ // passing true as a second parameter instructs the jvm to update the file in the file location used address is taken.
//            String transactionToString = "\n"+transactions.toString();
//            fileOutputStream.write(transactionToString.getBytes());
            for (Transaction transaction: transactions){
                if (!transaction.equals(transactions.get(0))){
                    fileOutputStream.write("\n".getBytes());
                    sendToStream(transaction,fileOutputStream);
                }
                else sendToStream(transaction,fileOutputStream);

            }

        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }


    public static void sendToStream(Transaction transactionToSend, FileOutputStream outputStream) throws IOException {
        outputStream.write(transactionToSend.getAmount().concat("   ").getBytes());
        outputStream.write(transactionToSend.getRecipient().concat("    ").getBytes());
        outputStream.write(transactionToSend.getSender().concat("   ").getBytes());
    }

}
