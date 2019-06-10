package sample;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller{


        //return a list of sublist with every sublist having a size less than taille
        List<List<Object>> partition(List<Object> liste, int taille){

            List<List<Object>> allSublists=new ArrayList();
            if(taille>0) {
                List<Object> buffer;
                int indexBegin=0;
                int indexEnd=taille;
                while(indexEnd<liste.size()) {
                    buffer=liste.subList(indexBegin,indexEnd);
                    allSublists.add(buffer);
                    indexBegin+=taille;
                    indexEnd+=taille;
                }
                if(indexBegin!=indexEnd)
                {
                    buffer=liste.subList(indexBegin,liste.size());
                    allSublists.add(buffer);
                }
            }
            else
                allSublists.add(liste);
            return allSublists;
        }

        @Test
        public void partitionTest() {
            List<Object> list= Arrays.asList(1,2,3,4,5);
            List<List<Object>> result=partition(list,3);
            List<List<Object>> expected=new ArrayList<>();
            expected.add(Arrays.asList(1,2,3));
            expected.add(Arrays.asList(4,5));
            Assert.assertEquals(result, expected);
            result=partition(list,2);
            expected=new ArrayList<>();
            expected.add(Arrays.asList(1,2));
            expected.add(Arrays.asList(3,4));
            expected.add(Arrays.asList(5));
            Assert.assertEquals(result, expected);
            result=partition(list,1);
            expected=new ArrayList<>();
            expected.add(Arrays.asList(1));
            expected.add(Arrays.asList(2));
            expected.add(Arrays.asList(3));
            expected.add(Arrays.asList(4));
            expected.add(Arrays.asList(5));
            Assert.assertEquals(result, expected);


        }

}
