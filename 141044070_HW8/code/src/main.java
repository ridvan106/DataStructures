/**
 *
 * @author Rıdvan Demirci 141044070
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        AVLTree<String> tree = new AVLTree<String>();
       
        
        tree.add("Nush");
        tree.add("ile");
        tree.add("uslanmayanı");
        tree.add("etmeli");
        tree.add("tekdir");
        tree.add("tekdir");
        tree.add("ile");
        tree.add("uslanmayanın");
        tree.add("hakkı");
        tree.add("kötekdir");
            tree.add("edille");
            tree.add("ferc");
            tree.add("dakik");

        System.out.println(tree.toString());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        // TODO code application logic here
    }
    
}
