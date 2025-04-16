package com.abel.dio_cotacao_moedas.singleton;

import com.abel.dio_cotacao_moedas.facade.Facade;
import com.abel.dio_cotacao_moedas.facade.IFacade;

public class SingFacade {
    private static class InstanceHolder {
        public static IFacade facade = new Facade();
    }

    private SingFacade() {}

    public static IFacade getInstance() {
        return InstanceHolder.facade;
    }
}
