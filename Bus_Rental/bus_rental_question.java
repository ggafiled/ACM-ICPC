/***
 Auther : ggafiled 
 Name : Nattapol Krobklang
***/


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      Map<String,Integer> bus_map = new HashMap<>();
      bus_map.put("A",0);
      bus_map.put("B",0);
      bus_map.put("C",0);
      String D[] = sc.nextLine().split(" ");
      for(int i=0;i<=D.length-1;i++){
            bus_map.replace("A",((bus_map.get("A") > 0)? bus_map.get("A")-1:0));
            bus_map.replace("B",((bus_map.get("B") > 0)? bus_map.get("B")-1:0));
            bus_map.replace("C",((bus_map.get("C") > 0)? bus_map.get("C")-1:0));
          if(bus_map.get("A") == 0 && bus_map.get("B") == 0 && bus_map.get("C") == 0){
            bus_map.replace("A",Integer.parseInt(D[i]));
            System.out.print("A\t");
          }else if((bus_map.get("A") == 0 && bus_map.get("B") == 0) || (bus_map.get("A") == 0 && bus_map.get("C") == 0)){
            bus_map.replace("A",Integer.parseInt(D[i]));
            System.out.print("A\t");
          }else if(bus_map.get("B") == 0 && bus_map.get("C") == 0){
            bus_map.replace("B",Integer.parseInt(D[i]));
            System.out.print("B\t");
          }else if(bus_map.get("A") == 0){
            bus_map.replace("A",Integer.parseInt(D[i]));
            System.out.print("A\t");
          }else if(bus_map.get("B") == 0){
            bus_map.replace("B",Integer.parseInt(D[i]));
            System.out.print("B\t");
          }else if(bus_map.get("C") == 0){
            bus_map.replace("C",Integer.parseInt(D[i]));
            System.out.print("C\t");
          }
      }
    }
}
