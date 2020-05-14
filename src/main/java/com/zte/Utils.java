package com.zte;

import java.util.Collection;

public class Utils {
    public static <T> boolean  isEmpty(Collection<T> entitys){
        return entitys == null || entitys.size() == 0;
    }
}
