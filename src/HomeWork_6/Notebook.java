package HomeWork_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notebook {
    public Notebook(String strToParse) {
        setPrice(Math.random() * 100000);
        brand = findRegex(strToParse, "(?<=Ноутбук\\s)[a-zA-Z]*(?=\\s)");
        model = findRegex(strToParse, "(?<=" + brand + "\\s).*(?=\\s[а-я]*\\s\\[)");
        color = findRegex(strToParse, "(?<=\\s)[а-яА-Я]*(?=\\s\\[)");
        size = Double.parseDouble(findRegex(strToParse, "[0-9]{1,2}.?[0-9]?(?=\\\")"));
        String[] paramsRAW = findRegex(strToParse, "(?<=\\[).*(?=\\])").split(", ");
        resolution = paramsRAW[0];
        matrixType = paramsRAW[1];
        cpu = paramsRAW[2];
        System.out.println(paramsRAW[3]);
        cpuCores = Integer.parseInt(findRegex(paramsRAW[3], "(?<=ядра\\:\\s)[0-9]{1,2}(?=\\sх)"));
        cpuFrequency = Double.parseDouble(findRegex(paramsRAW[3], "(?<=х\\s).*(?=\\sГГц)"));
        volRAM = Integer.parseInt(findRegex(paramsRAW[4], "(?<=RAM\\s)[0-9]{1,3}(?=\\sГБ)"));
        typeHDD = findRegex(paramsRAW[5], "[a-zA-Z]{1,}");
        volHDD = Integer.parseInt(findRegex(paramsRAW[5], "[0-9]{1,}"));
        videoAdaptor = paramsRAW[6];
        osPreinstall = paramsRAW[7];
    }
// Цена
    public void setPrice(Double inPrice) {
        price = inPrice;
    }

// Разрешение экрана
    public Boolean isMatchResolution(String inResolution) {
        return findStr(resolution, inResolution);
    }

//    Тип процессора
    public Boolean isMatchCPUType(String inCpu) {
        return findStr(cpu, inCpu);
    }

// Операционная система
    public Boolean isMatchOSType(String inOS) {
        return findStr(osPreinstall, inOS);
    }

    // Диапазон цен
    public Boolean isMatchPrice(Double minPrice, Double maxPrice) {
        return price >= minPrice && price <= maxPrice;
    }

    // Оперативная память
    public Boolean isMatchRAM(Integer minRAM, Integer maxRAM) {
        return volRAM >= minRAM && volRAM <= maxRAM;
    }

    // Поиск выражения
    private String findRegex(String inStr, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inStr);
        return matcher.find() ? matcher.group() : "";
    }

    // Проверка наличия в строке par содержимого inStr

    private Boolean findStr(String par, String inStr) {
        Pattern pattern = Pattern.compile(inStr.replace(" ", "").toLowerCase());
        Matcher matcher = pattern.matcher(par.replace(" ", "").toLowerCase());
        return matcher.find();
    }

    private Double price; // цена
    private String brand; // бренд
    private String model; // модель
    private String color; // цвет
    private Double size; // диагональ
    private String resolution; // разрешение экрана
    private String matrixType; // тип матрицы
    private String cpu; // модель ЦПУ
    private Integer cpuCores; // количество ядер процессора
    private Double cpuFrequency; // частота ЦПУ
    private Integer volRAM; // объем оперативной памяти
    private String typeHDD; // тип накопителя
    private Integer volHDD; // объем накопителя
    private String videoAdaptor; // марка видеокарты
    private String osPreinstall; // операционная система

    @Override
    public String toString() {
        return "Notebook{" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", price = '" + price + '\'' +
                '}';
    }
}

