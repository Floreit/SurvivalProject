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
    private double FOOD_MODIFIER = .20;
    private int SlaveCount = 5;
    
    
    
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
     
     
     
     
     private int getQuantity(int int1, int int2 ){
         return int1 + (int)(Math.random() * (int2 - int1) );
     }
     
     
     public void wood(int wood1, int wood2){
        if(wood >= 0){
            wood += getQuantity(wood1, wood2);
        }
     }
     public void stone(int stone1, int stone2){
        if(stone >= 0){
            stone += getQuantity(stone1, stone2);
        }
     }
     public void food(int food1, int food2){
         if(food >= 0){
             food += getQuantity( food1, food2 + getpeople() );
         }
     }
     public void iron(int iron1, int iron2){
         if(iron >= 0){
             iron += getQuantity( iron1, iron2 );
         }
     }
     public void people(){         
         if(food >= peoplemod && food >=0){
            peoplemod = people + 1;
            food = food - peoplemod;
            people++;
         }else if(food <= 0){
             food = 0;
         }else if(peoplemod <= 0){
             peoplemod = 0;
         }
     }
     public void people5(){
         if(people >= 0){
             people -= 5;
         }
         
         if ( peoplemod <= 0){
            peoplemod = 0;
         }
         if (people <= 0){
             people = 0;
         }
     }
    /**
      * Buy Slaves providing there is enough food
      */
     public void buy_slaves(){
         Double cost = Math.ceil( FOOD_MODIFIER * people );         
         if( food > cost ){
             food -= cost.intValue();
             people+= SlaveCount;
             peoplemod = cost.intValue();
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


