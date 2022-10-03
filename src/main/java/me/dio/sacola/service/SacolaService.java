package me.dio.sacola.service;

import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.resource.dto.ItemDto;

public interface SacolaService {


    Item incluiItemNaSacola(ItemDto ItemDto);
    Sacola  verSacola(Long id);
    Sacola fecharSacola(Long Id, int formaPagamento);
}
