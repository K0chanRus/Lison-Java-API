package org.example.Lison3.Task11;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cube {
    private Integer lenght;
    private String color;
    private String material;

    public  int getVoluem(){
        return (int)Math.pow(lenght, 3);
    }
}

