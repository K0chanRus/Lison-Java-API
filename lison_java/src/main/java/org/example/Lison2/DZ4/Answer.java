package org.example.Lison2.DZ4;

public class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder inOut = new StringBuilder();
        inOut.append(PARAMS);
        int startName = inOut.indexOf("name") + 7;
        inOut.delete(0,startName);
        int endName = inOut.indexOf(",") - 1;
        String name = inOut.substring(0, endName);

        int startCountry = inOut.indexOf("country") + 10;
        inOut.delete(0,startCountry);
        int endCountry = inOut.indexOf(",") - 1;
        String country = inOut.substring(0, endCountry);

        int startCity = inOut.indexOf("city") + 7;
        inOut.delete(0,startCity);
        int endCity = inOut.indexOf(",") - 1;
        String city = inOut.substring(0, endCity);

        int startAge = inOut.indexOf("age") + 6;
        inOut.delete(0,startAge);
        int endAge = inOut.indexOf("}") - 1;
        String age = inOut.substring(0, endAge);

        inOut.setLength(0);
        inOut.append(QUERY);

        if(!name.equals("null")){
            inOut.append("name='").append(name).append("' ");
        }if (!country.equals("null")){
            inOut.append("and ").append("country='").append(country).append("' ");
        }if (!city.equals("null")){
            inOut.append("and ").append("city='").append(city).append("' ");
        }if (!age.equals("null")){
            inOut.append("and ").append("age='").append(age).append("' ");
        }
        return inOut;
    }
}
