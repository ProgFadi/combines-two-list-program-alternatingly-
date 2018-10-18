/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinetwolist;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Eng. Fadi R
 */
public class CombineTwoList extends Application {
    
    
    @Override
    public void start(Stage stage) throws Exception {
        
         //comines two object lists  
        // here i suppose the first list is string
        List<String> list1=new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
       //  here i suppose the  list is inrteger
        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3); 
        
         // i can declare function to accesot object instead of integers and string
        // function will merge two list
        combinesLists(list1,list2);
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

     // cmerge two list with suppoing first list is string ans another is integer
    public List<Object> combinesLists(List<String> list1, List<Integer> list2)
    {
        List<Object> tempList=new ArrayList<>();
        if(list1.size()==list2.size())
        {
            for(int i=0;i<list1.size()*2;i++) // mul list1 by 2 cause 2 list is same size :) and io need to iterate through all two list
            {
                if(i%2==0)
                {
                    tempList.add(list1.get(i/2)); // i/2 to acvoid outOfindexArray exception
                    
                }
                else{
                     tempList.add(list2.get(i/2)); // i/2 to acvoid outOfindexArray exception
                }
                System.out.println("arraytest.ArrayTest.combinesLists() ||   val is : "+tempList.get(i));
            }
        }
        return tempList;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
