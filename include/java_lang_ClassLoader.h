/* DO NOT EDIT THIS FILE - it is machine generated */
#include <native.h>
/* Header for class java_lang_ClassLoader */

#ifndef _Included_java_lang_ClassLoader
#define _Included_java_lang_ClassLoader
struct Hjava_util_Hashtable;

#pragma pack(4)

typedef struct Classjava_lang_ClassLoader {
    /*boolean*/ long initialized;
    struct Hjava_util_Hashtable *classes;
} Classjava_lang_ClassLoader;
HandleTo(java_lang_ClassLoader);

#pragma pack()

#ifdef __cplusplus
extern "C" {
#endif
extern void java_lang_ClassLoader_init(struct Hjava_lang_ClassLoader *);
struct Hjava_lang_String;
struct Hjava_lang_Class;
extern struct Hjava_lang_Class *java_lang_ClassLoader_defineClass0(struct Hjava_lang_ClassLoader *,struct Hjava_lang_String *,HArrayOfByte *,long,long);
extern void java_lang_ClassLoader_resolveClass0(struct Hjava_lang_ClassLoader *,struct Hjava_lang_Class *);
extern struct Hjava_lang_Class *java_lang_ClassLoader_findSystemClass0(struct Hjava_lang_ClassLoader *,struct Hjava_lang_String *);
struct Hjava_io_InputStream;
extern struct Hjava_io_InputStream *java_lang_ClassLoader_getSystemResourceAsStream0(struct Hjava_lang_ClassLoader *,struct Hjava_lang_String *);
extern struct Hjava_lang_String *java_lang_ClassLoader_getSystemResourceAsName0(struct Hjava_lang_ClassLoader *,struct Hjava_lang_String *);
#ifdef __cplusplus
}
#endif
#endif
