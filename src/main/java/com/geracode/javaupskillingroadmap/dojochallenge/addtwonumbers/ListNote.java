package com.geracode.javaupskillingroadmap.dojochallenge.addtwonumbers;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ListNote {

    private int val;
    private ListNote next;

    public ListNote(int val) {
        this.val = val;
    }
}
