package com.example.googletest;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class sheeetDto implements Serializable {
    private String range;
    private String majorDimension;
    private List<String[]>values;
}
