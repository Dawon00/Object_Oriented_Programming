public class ExceptTestStack {
    public static void main(String[] args) throws Exception{
        try{
            String obj = "¹°°Ç";      // String obj = ¡°120"; 
            int objCnt = Integer.valueOf(obj);
            System.out.println(objCnt);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}