/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalmk2;

/**
 *
 * @author Floreit
 */
public class Storage
{
    private int wood = 0; 
    private int stone = 0;
    private int food = 0;
    private int iron = 0;
    private int people = 15;
    private int peoplemod = 0;
    
    public void Storage()
    {
      
    }
    
//     public void forest()
//    {       
//        int tempwood =0;
//        int tempstone =0;  
//        tempwood = wood(1,11);
//        tempstone = stone(1,11);
//        System.out.println("you got " + tempwood + " wood");
//        System.out.println("you got " + tempstone + " stone");                  
//              
//    }
//     
//     public void mountain ()
//     {
//         int tempiron = 0;
//         int tempstone = 0;
//         tempiron = iron(1,11);
//         tempstone = stone(1,11);
//         System.out.println("you got " + tempiron + " iron");
//         System.out.println("you got " + tempstone + " stone");
//         
//     }
//     public void plains ()
//     {
//         int tempfood = 0;      
//         tempfood = food(1,11);
//         
//         System.out.println("you got " + tempfood + " food");
//                 
//     }
//     public void test()
//     {
//         int control = 0;
//         control = 1 + (int)(Math.random() * ((100 - 1)));
//         if(control >= 5)
//         {
//             
//         System.out.println("control = " + control);
//         int tempiron = 0;
//         int tempstone = 0;
//         tempiron = iron(1,11);
//         tempstone = stone(1,11);
//         System.out.println("you got " + tempiron + " iron");
//         System.out.println("you got " + tempstone + " stone");
//         }
//         else
//         {
//             System.out.println("control = " + control);
//                  
//
//         }
//         
//     }
     
     
     
     
     
     
     
     public void wood(int wood1, int wood2)
     {         
        int tempwood = 0;
        if(wood >= 0)
        {
        tempwood = wood1 + (int)(Math.random() * ((wood2 - wood1)));
        wood = wood + tempwood;                          
        }
     }
     public void stone(int stone1, int stone2)
     {
        int tempstone = 0; 
        if(stone >= 0)
        {
        tempstone = stone1 + (int)(Math.random() * ((stone2 - stone1)));
        stone = stone + tempstone;        
        }
     }
     public void food(int food1, int food2)
     {
         int tempfood = 0;         
         if(food >= 0)
         {
         tempfood = food1 + (int)(Math.random() * ((food2 - food1)));
         food = food + tempfood;       
         }
     }
     public void iron(int iron1, int iron2)
     {
         int tempiron = 0;
         if(iron >= 0)
         {
         tempiron = iron1 + (int)(Math.random() * ((iron2 - iron1)));
         iron = iron + tempiron;
         }
     }
     public void people()
     {
         if(food >= peoplemod && food >=0)
         {
         peoplemod = people + 1;
         food = food - peoplemod;
         people = people + 1;
         }
         if(food <= 0)
         {
             food = 0;
         }
         if(peoplemod <= 0)
         {
             peoplemod = 0;
         }
     }
     public void people5()
     {
         if(people <= 0)
         {
             peoplemod = 0;
         }
         if ( peoplemod >= 0)
         {
         people = people - 5;
         }
     }
     
     
     
     
     
     //----------------------------------------------------------------------
     //---------RESETVALUES--------------------------------------------------
     public void ResetValues()    
     {
         iron = 0;
         food = 0;
         wood = 0;
         stone = 0;
         people = 15;
         peoplemod = 0;         
     }
         
         
         
//------------------------------------------------
//---------DO NOT DISTURB-------------------------         
     
     public int getwood()
     {         
         return (wood);
     }
     public int getstone()
     {
         return(stone);
     }
     public int getiron()
     {                 
         return(iron);
     }
     public int getfood()
     {
         return(food);
     }
     public int getpeople()
     {
         return(people);
     }  
     public int getpeoplemod()
     {
         return(peoplemod);
     }
             
             
}


