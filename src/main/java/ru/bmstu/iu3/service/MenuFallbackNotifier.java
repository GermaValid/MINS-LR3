package ru.bmstu.iu3.service;

/**
 * Сообщает о переходе на резервное меню вместо загрузки из CSV.
 * Отделяет политику загрузки ({@link MenuService}) от способа донесения информации (DIP, SRP).
 */
public interface MenuFallbackNotifier {

    /**
     * @param reasonSummary краткое описание причины для пользователя или логов
     * @param cause         необязательно; если есть, типично передаётся исключение при разборе или чтении файла
     */
    void onMenuCsvFallback(String reasonSummary, Throwable cause);
}
