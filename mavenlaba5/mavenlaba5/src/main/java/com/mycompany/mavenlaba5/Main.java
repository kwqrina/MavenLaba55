package com.mycompany.mavenlaba5;

import foundation.JFrames;

/**
 * Главный класс игры Mortal Kombat B Version.
 * Запускает игровой интерфейс.
 */
public class Main {

    /**
     * Точка входа в приложение.
     * Создаёт и отображает главное окно игры.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        JFrames gameInterface = new JFrames();
        gameInterface.setVisible(true);
    }
}