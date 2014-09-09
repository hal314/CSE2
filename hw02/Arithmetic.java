//Hao Lu
//HW2
//Arithetic Program


//Set up a Class
public class Arithmetic{
    public static void main(String [] args){
        //set up variables and make assumptions
        int nSocks=3;//Numbers of pairs of socks
        double sockCost$=2.58;//Cost per pair of socks
        int nGlasses=6;//Number of drinking glasses
        double glassCost$=2.29;//Cost per glass
        int nEnvelopes=1;//Number of boxes of envelopes
        double envelopeCost$=3.25;//Cost per box of envelopes
        double taxPercent=0.06;//PA sales tax rate
        double totalSockCost$;//total cost of socks
        double sockTax$;//tax of socks
        double totalGlassCost$;//total cost of glasses
        double glassTax$;//tax of glasses
        double totalEnvelopeCost$;//total cost of envelopes
        double envelopeTax$;//tax of envelopes
        double totalPurchasesCost$;//total cost of purchases
        double totalTax$;//total sales tax
        double totalActualCost$;//total actual cost including tax
        
        
        //calculate the total costs and taxes for each of the items
        totalSockCost$=nSocks*sockCost$;//calculate total cost of socks
        sockTax$=totalSockCost$*taxPercent;//calculate tax of socks
        totalGlassCost$=nGlasses*glassCost$;//calculate total cost of glasses
        glassTax$=totalGlassCost$*taxPercent;//calculate tax of glasses
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;//calculate total cost of envelopes
        envelopeTax$=totalEnvelopeCost$*taxPercent;//calculate tax of envelopes
        totalPurchasesCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;//calculate total cost before tax
        totalTax$=totalPurchasesCost$*taxPercent;//calculate total sales tax;
        totalActualCost$=totalPurchasesCost$+totalTax$;//calculte total cost including tax
        
        
        //Use the input variables to print out, on separate lines, the item being bought,  how many of the given item is being bought, and the cost per item
        System.out.println(nSocks+" pairs of socks are being bought and the cost per pair is $"+sockCost$);
        System.out.println(nGlasses+" glasses are being bought and the cost per glass is $"+glassCost$);
        System.out.println(nEnvelopes+" box of envelopes is being bought and the cost per box is $"+envelopeCost$);
        
        //Display the cost of each of item and the sales tax for that item 
        System.out.printf("The total cost of socks is $"+totalSockCost$+" and the sales tax is $"+"%.2f",sockTax$);
        System.out.println();
        System.out.printf("The total cost of glasses is $"+totalGlassCost$+" and the sales tax is $"+"%.2f",glassTax$);
        System.out.println();
        System.out.printf("The total cost of envelopes is $"+totalEnvelopeCost$+" and the sales tax is $"+"%.2f",envelopeTax$);
        System.out.println();
        
        // Display the total cost of the purchases (before tax), the total sales tax, and the total cost of the purchases (including sales tax). 
        System.out.println("The total cost pf the purchases (before tax) is $"+totalPurchasesCost$);
        System.out.printf("The total sales tax is $"+"%.2f",totalTax$);
        System.out.println();
        System.out.printf("The total cost of the purchases (including tax) is $"+"%.2f",totalActualCost$);
        System.out.println();
    }
}