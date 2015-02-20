
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    private ArrayListInt array;
    
    public Test(){
        array = new ArrayListInt();
        
        //Iremos probando metodo por metodo que todo funciona bien
        //Metodo inicial, el tamaño inicial del array.
        System.out.println("\t\tArrayList creado");
        String test1 = null;
        if(array.size() == 0){
            test1 = "OK. El metodo size() devuelve " + array.size() + ". Debería devolver 0";
        }
        else{
            test1 = "ERROR. El metodo size() devuelve " + array.size() + ". Debería devolver 0";
        }
        System.out.println(test1);
        
        //Ahora añadiremos unos cuantos números sin especificar indice:
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(2);
        array.add(3);
        System.out.println("\t\tAñadidos 5 números con el método add()");
        String test2 = null;
        if(array.size()== 5){
            test2 = "OK. El metodo size() devuelve " + array.size() +". Debería devolver 5";
        }
        else{
            test2 = "ERROR. El metodo size() devuelve " + array.size() + ". Debería devolver 5";
        }
        System.out.println(test2);
        
        //Testeamos el metodo add con parametro index
        array.add(2,4);
        System.out.println("\t\tAñadido el número 4 en el indice 2 con metodo add(int index int elemento)");
        String test3 = null;
        if(array.size() == 6){
            test3 = "OK. El metodo size() devuelve " + array.size() + ". Debería devolver 6";
        }
        else{
            test3 = "ERROR. El metodo size() devuelve " + array.size() + ". Debería devolver 6";
        }
        System.out.println(test3);
        
        System.out.println("\t\tComprobamos el metodo get(int index) con el ultimo numero añadido");
        String test4 = null;
        if(array.get(2)==4){
            test4 = "OK. El metodo get(2) devuelve " + array.get(2) + ". Debería devolver 4";
        }
        else{
            test4 = "ERROR. El metodo get(2) devuelve " + array.get(2) + ". Debería devolver 4";
        }
        System.out.println(test4);
        
       
    }
}
