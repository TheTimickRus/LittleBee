package org.exTeam.business.utils;

public enum OrderStatus {
    THE_ORDER_IS_WAITING_FOR_PAYMENT, // Ожидает оплаты
    THE_ORDER_IS_BEING_COLLECTED, // Собирается
    THE_ORDER_HAS_BEEN_SENT_FOR_DELIVERY, // Передан в доставку
    THE_ORDER_IS_BEING_DELIVERED, // Доставляется
    THE_ORDER_IS_WAITING_IN_THE_STORE, // Ожидает в магазине
    THE_ORDER_ISSUED // Выдан
}
