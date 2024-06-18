package com.city.warehouse.dto;

import com.city.warehouse.entity.Menu;
import lombok.Data;

import java.util.Objects;

/**
 * @author 31700
 */
@Data
public class MenuDto {
    private Integer menuId;

    private String menuName;

    private String icon;

    private String url;

    private Integer pid;

    private String remark;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MenuDto menuDto = (MenuDto) o;
        return Objects.equals(menuName, menuDto.menuName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuName);
    }
}
