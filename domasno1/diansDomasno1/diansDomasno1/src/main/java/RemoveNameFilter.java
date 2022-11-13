package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNameFilter implements Filter<String>{

    @Override
    public String execute(String input) {

        //id,ime,adresa,grad
        String[] seperated = input.split(",");
        List<String> noName = new ArrayList<>();
        //String[] nName = new String[4];
        for(int i=0;i< seperated.length;i++)
        {
            if(i!=1)
            {
                noName.add(seperated[i]);
                //nName[i] = seperated[i];
            }
        }

        return noName.toString();
    }
}
