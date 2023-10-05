package dev.vivek.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Refil {
    private Ink ink;
    private Nib nib;
    private Double width;
}
