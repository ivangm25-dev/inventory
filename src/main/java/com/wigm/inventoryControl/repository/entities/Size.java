package com.wigm.inventoryControl.repository.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Size {
    private int h;
    private int w;
    private String uom;
}
