Class Converter
Clean Architecture level: Use Case

Responsibilities:

What it does:
* ConvertDateTimeDouble: converts a LocalDateTime object and converts it into a double object
* ConvertLocalTimeDouble: converts a LocalTime object and converts it into a double object
* ConvertDoubleToLocalTime: converts a Double object and converts it to a LocalTime object

Behaviour for which an object is accountable:
* Converters will be able to convert the types of objects to other types.

Collaborators:
* NonFixedTask
* Putter
* Week
