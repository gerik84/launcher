package net.launcher.run;

public class Settings
{
	private static Boolean DEBUG = false;
	private static String MY_IP = DEBUG ? "localhost" : "2.93.195.196";

	/** Настройка заголовка лаунчера */
	public static final String  title		         = "Launcher"; //Заголовок лаунчера
	public static final String  titleInGame  	     = "Minecraft"; //Заголовок лаунчера после авторизации
	public static final String  baseconf		     = "voxelaria"; //Папка с файлом конфигурации
	public static final String  pathconst		     = "voxelaria/%SERVERNAME%"; //Конструктор пути к папке с MC
	public static final String  skins                = "MinecraftSkins/"; //Папка скинов
	public static final String  cloaks               = "MinecraftCloaks/"; //Папка плащей
	/** Параметры подключения */
	public static final String  http	             = "http://";  //Протокол подключения https:// если есть ssl сертификат
	public static final String  domain	 	         = MY_IP;//Домен сайта
	public static final String  siteDir		         = "launcher";//Папка с файлами лаунчера на сайте
	public static final String 	RegisterUrl	         = http + MY_IP + "/";//Ссылка на регистрацию, при useRegister = false
	public static final String  updateFile		     = http + MY_IP + "/" + siteDir + "/launcher/fix";//Ссылка на обновления лаунчера. Не писать на конце ".exe .jar"!
	public static final String  buyVauncherLink      = "http://plati.ru/"; //Ссылка на страницу покупки ваучеров
	public static final String  iMusicname           = "001.mp3";
	public static final int  thread                  = 8; //Количество потоков для загрузки файлов.
	public static final String[] p = {"wireshark", "cheat"};  //Список запрещенных процессов.
	
	public static int height                         = 532;      //Высота окна клиента
	public static int width                          = 900;      //Ширина окна клиента
	public static int defaultmemory                  = 768;      //Выделение памяти при первом запуске.
        
	public static String[] servers =
	{
		"voxelaria1710, localhost, 25565, 1.7.10",
	};

	/** Настройка панели ссылок **/
	public static final String[] links = 
	{
		//Для отключения добавьте в адрес ссылки #
		//"url::http://",
		"::#",
	};

	/** Настройки структуры лаунчера */
	public static boolean useAutoenter	         =  true;  //Использовать функцию автозахода на выбранный сервер
	public static boolean useRegister		     =  false;  //Использовать Регистрацию в лаунчере
	public static boolean useStandartWB		     =  true;   //Использовать стандартный браузер для открытия ссылок
	public static boolean usePersonal		     =  true;   //Использовать Личный кабинет
	public static boolean customframe 		     =  true;   //Использовать кастомный фрейм
	public static boolean useConsoleHider		 =  false;  //Использовать скрытие консоли клиента
	public static boolean useModCheckerTimer	 =  true;   //Перепроверка jar через 30 секунд
	public static int     useModCheckerint       =  2;      //Количество раз перепроверки jar во время игры
	public static boolean assetsfolder           =  false;  //Скачивать assets из папки, или из архива (true=из папки false=из архива) в connect.php должно быть так же.

	public static final String protectionKey	 = "1234567890"; //Ключ сессии.
	public static final String key1              = "1234567891234567"; //16 Character Key Ключ пост запросов
	public static final String key2              = "1234567891234567"; //16 Character Key Ключ пост запросов
	
	public static boolean debug		 	         =  true; //Отображать все действия лаунчера (отладка)(true/false)
    public static boolean drawTracers		     =  false; //Отрисовывать границы элементов лаунчера
	public static final String masterVersion     = "v0.1"; //Версия лаунчера

	public static boolean release 		         =  false;  /**Ставим true после окончания настройки! 
														    Необходимо для автообновления лаунчера 
														    после смены ключей key1 key2.*/
	public static void onStart() {}
	public static void onStartMinecraft() {}
	
}