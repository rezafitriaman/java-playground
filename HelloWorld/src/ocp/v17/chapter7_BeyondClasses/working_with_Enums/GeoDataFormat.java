package ocp.v17.chapter7_BeyondClasses.working_with_Enums;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum GeoDataFormat {
    // Enum entries with primary extensions and supported companion extensions
    SHAPEFILE(List.of("shp"), Arrays.asList("shx", "dbf", "prj")),
    GEOJSON(List.of("geojson", "json"), Collections.emptyList()),
    KML(List.of("kml"), List.of("kmz")),
    GPKG(List.of("gpkg"), Collections.emptyList()),
    CSV(List.of("csv"), Collections.emptyList());

    // fields
    private final List<String> primaryExtensions;
    private final List<String> companionExtensions;

    // Constructor
    GeoDataFormat(
            List<String> primaryExtensions,
            List<String> companionExtensions
    ) {
        this.primaryExtensions = primaryExtensions;
        this.companionExtensions = companionExtensions;
    }

    // Getters
    public List<String> getPrimaryExtensions() {
        return this.primaryExtensions;
    }

    public List<String> getCompanionExtensions() {
        return this.companionExtensions;
    }

    // Static utility methods
    private static final List<GeoDataFormat> ALL_GEODATA_FORMATS = List.of(values());

    public static Set<String> getAllSupportedExtensions() {
        return ALL_GEODATA_FORMATS.stream()
                .flatMap(format -> Stream.concat(
                        format.getPrimaryExtensions().stream(),
                        format.getCompanionExtensions().stream()
                ))
                .collect(Collectors.toSet());
    }

    // Helper method to find format by extension
    public static GeoDataFormat fromExtension(String extension) {
        String lowerExt = extension.toLowerCase();
        return ALL_GEODATA_FORMATS
                .stream()
                .filter(format -> format.getPrimaryExtensions().contains(lowerExt) || format.getCompanionExtensions().contains(lowerExt))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unsupported file extension: " + extension));
    }
}

class demo {
    public static void main(String[] args) {

//        Creates: A new array of enum values each time (through values())
//        Converts: The array to a string representation using Arrays.toString()
//        Result: A String containing the formatted output
//        Mutability: The array itself is mutable (though enum values are fixed)
        System.out.println(Arrays.toString(GeoDataFormat.values()));

//        Creates:
//          A new array (through values())
//          An immutable List wrapper around that array via List.of()
//        Converts: The List's toString() is called (which inherits from AbstractCollection)
//        Result: A String with similar formatting
//        Mutability: The created List is completely immutable
        System.out.println(List.of(GeoDataFormat.values()));

//        Stream.of(GeoDataFormat.values()).forEach(System.out::println);
        System.out.println(GeoDataFormat.getAllSupportedExtensions());
        System.out.println(GeoDataFormat.SHAPEFILE.getPrimaryExtensions());
        System.out.println("from extension: " + GeoDataFormat.fromExtension("prj"));
        Optional<GeoDataFormat> first = List.of(GeoDataFormat.values()).stream().filter(format -> format.getPrimaryExtensions().contains("geojson")).findFirst();
        System.out.println(first);

        List.of(GeoDataFormat.values()).stream().filter(format -> format.getPrimaryExtensions().contains("shp")).forEach(System.out::println);
    }
}
