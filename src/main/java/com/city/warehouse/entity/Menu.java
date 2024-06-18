package com.city.warehouse.entity;

import com.city.warehouse.dto.MenuDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * (Menu)实体类
 *
 * @author zsk
 * @since 2024-04-16 19:12:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private Integer menuId;
    
    private String menuName;
    
    private String icon;
    
    private String url;
    
    private Integer pid;

    private String remark;

    private List<MenuDto> subMenu;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Menu menu = (Menu) o;
        return Objects.equals(menuId, menu.menuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId);
    }
}

