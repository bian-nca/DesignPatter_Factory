/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desingpatter_factory;

import PatterFactory.IcmsFactory;
import java.math.BigDecimal;

import modelo.Orcamento;

/**
 *
 * @author Bianca
 */
public class DesingPatter_Factory {

    public static void main(String[] args) {

       Orcamento orcamento = new Orcamento(new BigDecimal("1500.00"), "ICMS_MG");
       IcmsFactory icmsFactory = new IcmsFactory();
       BigDecimal resultado = icmsFactory.getIcmsPorEstado("ICMS_RO").calculoPorRegiao(orcamento);
       System.out.println("Resultado do ICMS da região informado: " +resultado);
    }
}
