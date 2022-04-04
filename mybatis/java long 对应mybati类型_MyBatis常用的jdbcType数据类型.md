#### java long 对应mybati类型_MyBatis常用的jdbcType数据类型


MyBatis 通过包含的jdbcType类型

BIT FLOAT CHAR TIMESTAMP OTHER UNDEFINED

TINYINT REAL VARCHAR BINARY BLOB NVARCHAR

SMALLINT DOUBLE LONGVARCHAR VARBINARY CLOB NCHAR

INTEGER NUMERIC DATE LONGVARBINARY BOOLEAN NCLOB

BIGINT DECIMAL TIME NULL CURSOR

Mybatis中javaType和jdbcType对应和CRUD例子

Mybatis中 jdbc Type 和 java Type对应关系

JDBC Type Java Type

CHAR String

VARCHAR String

LONGVARCHAR String

NUMERIC java.math.BigDecimal

DECIMAL java.math.BigDecimal

BIT boolean

BOOLEAN boolean

TINYINT byte

SMALLINT short

INTEGER int

BIGINT long

REAL float

FLOAT double

DOUBLE double

BINARY byte[]

VARBINARY byte[]

LONGVARBINARY byte[]

DATE java.sql.Date

TIME java.sql.Time

TIMESTAMP java.sql.Timestamp

CLOB Clob

BLOB Blob

ARRAY Array

DISTINCT mapping of underlying type

STRUCT Struct

REF Ref

DATALINK java.net.URL[color=red][/color]

以上所述是小编给大家介绍的MyBatis常用的jdbcType数据类型，希望对大家有所帮助，如果大家有任何疑问请给我留言，小编会及时回复大家的。在此也非常感谢大家对脚本之家网站的支持！
————————————————
版权声明：本文为CSDN博主「小甜甜小甜甜」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/weixin_29290947/article/details/112049585