#PwdBook - A better password tool#

PwdBook runs on Android 4.0+  and helps you to manage sensitive data securely with delightful Material experience[<sup>1</sup>](#note1) and powerful features.

---

## Features

* [AES](http://en.wikipedia.org/wiki/Advanced_Encryption_Standard) encryption, with 256 bits key and [PKCS#5](http://en.wikipedia.org/wiki/PBKDF2) standard
* Data synchronization[<sup>2</sup>](#note2)
* Data import and export
* Password generation
* Multiple Material themes
* Free edit: add or remove any information as you wish, without a template
* In-app Search (under development, available in 2.0)

### About the Name
PwdBook was originally called Passbook. After I realized many other apps also use this name, I decided to change it to PwdBook, another abbreviation form of "Password Book". For all releases before version 2.0, the name was Passbook.

### Download

[![image]](https://play.google.com/store/apps/details?id=com.z299studio.pbfree)
[image]: https://developer.android.com/images/brand/en_generic_rgb_wo_60.png "Get it on Google Play"

---

## Credits

### Icons

* [Material Design Icons](https://github.com/google/material-design-icons) (PwdBook 2.0+), Copyright © Google
* [Icon pack for Android L from Icons8](http://icons8.com/android-L/) (Passbook 1.0+), Copyright © Icons8.com

### Open Source Projects/Libraries

* [OpenCSV](http://opencsv.sourceforge.net), Copyright © OpenCSV team

## License

PwdBook is licensed under [Apache License 2.0](LICENSE).

    /*
     * Copyright (C) 2015 Qianqian Zhu <zhuqianqian.299@gmail.com>
     *
     * Licensed under the Apache License, Version 2.0 (the "License");
     * you may not use this file except in compliance with the License.
     * You may obtain a copy of the License at
     *
     *      http://www.apache.org/licenses/LICENSE-2.0
     *
     * Unless required by applicable law or agreed to in writing, software
     * distributed under the License is distributed on an "AS IS" BASIS,
     * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * See the License for the specific language governing permissions and
     * limitations under the License.
     */
---

### Notes

<a name="note1" id="md_anchor"><sup>1</sup>Material Themes</a>: Certain Material features require Android 4.4 or Android 5.0.

<a name="note2" id="md_anchor"><sup>2</sup>data synchronization</a>: Synchronization before version 2 uses Google Play Games snapshot service, which can save up to 3MB data. The integration with Google Drive is underdevelopment and it is to be available in version 2.0.