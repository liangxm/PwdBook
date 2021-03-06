/*
* Copyright 2015 Qianqian Zhu <zhuqianqian.299@gmail.com> All rights reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.z299studio.pb;

public interface ItemFragmentListener {
    void onEdit(int categoryId, int accountId);
    void onDelete(int accountId);
    void onDeleted(int categoryId, int count);
    void onSave(int categoryId);
    void onSelect(int id);
    void onSaveChanged(int account, int category, int oldCategory, boolean nameChanged);
    void onCategorySaved();
    void onLockDrawer(boolean lock);
}
