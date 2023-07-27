package Que_1;
interface replace{
    public String rep(String str);
}

public class Vowel_replace {
    public static void main(String[] args) {
//        String st = "Ansh";
//        st.toCharArray();





;        replace r = (Str)-> {
            String strr = new String();
            StringBuilder st = new StringBuilder();  // mutable
            for(char c : Str.toCharArray()){
                Character.toLowerCase(c);
                if((c =='a' || c=='e'|| c=='i'|| c=='o'||c=='u')) {
                    st.append('#');
                }

                else {
                    st.append(c);
                }
            }

            return  st.toString();

        };

        //r.rep(" this is the new string that contains vowels");
        System.out.println( r.rep(" This is the new string that contains vowels"));

    }


    }

