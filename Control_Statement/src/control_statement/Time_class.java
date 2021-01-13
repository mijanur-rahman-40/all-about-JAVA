
package first_project;
 class time{
    private int hour;
    private int minute;
    private int second;
    public void set_time(int h,int m,int s){
        hour =(( h>=0 && h<24 )?  h: 0);
        minute= ((m>= 0 && m<60) ? m: 0);
        second=(( s>=0 && s<60 ) ? s: 0);
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d:",hour,minute,second);
    }
    public String toString(){
        return String.format("%d:%02d:%02d: %s",((hour == 0 || hour == 12) ? 12 : hour % 12),minute,second,(hour < 12 ? "AM" : "PM"));
    }
}
public class Time_class {
   public static void main(String args[]){
       time ob=new time();
       System.out.println("The universal time is:  ");
       System.out.println(ob.toUniversalString());
       System.out.println("The initral standard time is: ");
       System.out.println(ob.toString());
       
       
       ob.set_time(13,27,6);
       System.out.println("The universal time after set_time is:  ");
        System.out.println(ob.toUniversalString());
       System.out.println("The  standard time after initial time is: ");
       System.out.println(ob.toString());
       
   }
}
