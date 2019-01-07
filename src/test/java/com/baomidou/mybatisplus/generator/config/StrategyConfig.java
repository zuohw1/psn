/**
 * Copyright (c) 2011-2020, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.generator.config;

import java.util.List;

import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.toolkit.StringUtils;

/**
 * <p>
 * 绛栫暐閰嶇疆椤�
 * </p>
 *
 * @author YangHu, tangguo, hubin
 * @since 2016/8/30
 */
public class StrategyConfig {

    /**
     * 琛ㄥ悕銆佸瓧娈靛悕銆佹槸鍚︿娇鐢ㄤ笅鍒掔嚎鍛藉悕锛堥粯璁� false锛�
     */
    public static boolean DB_COLUMN_UNDERLINE = false;

    /**
     * 鏄惁澶у啓鍛藉悕
     */
    private boolean isCapitalMode = false;

    /**
     * 鏄惁璺宠繃瑙嗗浘
     */
    private boolean skipView = false;

    /**
     * 鏁版嵁搴撹〃鏄犲皠鍒板疄浣撶殑鍛藉悕绛栫暐
     */
    private NamingStrategy naming = NamingStrategy.nochange;
    /**
     * 鏁版嵁搴撹〃瀛楁鏄犲皠鍒板疄浣撶殑鍛藉悕绛栫暐<br/>
     * 鏈寚瀹氭寜鐓� naming 鎵ц
     */
    private NamingStrategy columnNaming = null;

    /**
     * 琛ㄥ墠缂�
     */
    private String[] tablePrefix;

    /**
     * 瀛楁鍓嶇紑
     */
    private String[] fieldPrefix;

    /**
     * 鑷畾涔夌户鎵跨殑Entity绫诲叏绉帮紝甯﹀寘鍚�
     */
    private String superEntityClass;

    /**
     * 鑷畾涔夊熀纭�鐨凟ntity绫伙紝鍏叡瀛楁
     */
    private String[] superEntityColumns;

    /**
     * 鑷畾涔夌户鎵跨殑Mapper绫诲叏绉帮紝甯﹀寘鍚�
     */
    private String superMapperClass = ConstVal.SUPERD_MAPPER_CLASS;

    /**
     * 鑷畾涔夌户鎵跨殑Service绫诲叏绉帮紝甯﹀寘鍚�
     */
    private String superServiceClass = ConstVal.SUPERD_SERVICE_CLASS;

    /**
     * 鑷畾涔夌户鎵跨殑ServiceImpl绫诲叏绉帮紝甯﹀寘鍚�
     */
    private String superServiceImplClass = ConstVal.SUPERD_SERVICEIMPL_CLASS;

    /**
     * 鑷畾涔夌户鎵跨殑Controller绫诲叏绉帮紝甯﹀寘鍚�
     */
    private String superControllerClass;

    /**
     * 闇�瑕佸寘鍚殑琛ㄥ悕锛堜笌exclude浜岄�変竴閰嶇疆锛�
     */
    private String[] include = null;

    /**
     * 闇�瑕佹帓闄ょ殑琛ㄥ悕
     */
    private String[] exclude = null;
    /**
     * 銆愬疄浣撱�戞槸鍚︾敓鎴愬瓧娈靛父閲忥紙榛樿 false锛�<br>
     * -----------------------------------<br>
     * public static final String ID = "test_id";
     */
    private boolean entityColumnConstant = false;

    /**
     * 銆愬疄浣撱�戞槸鍚︿负鏋勫缓鑰呮ā鍨嬶紙榛樿 false锛�<br>
     * -----------------------------------<br>
     * public User setName(String name) { this.name = name; return this; }
     */
    private boolean entityBuilderModel = false;

    /**
     * 銆愬疄浣撱�戞槸鍚︿负lombok妯″瀷锛堥粯璁� false锛�<br>
     * <a href="https://projectlombok.org/">document</a>
     */
    private boolean entityLombokModel = false;

    /**
     * Boolean绫诲瀷瀛楁鏄惁绉婚櫎is鍓嶇紑锛堥粯璁� false锛�<br>
     * 姣斿 : 鏁版嵁搴撳瓧娈靛悕绉� : 'is_xxx',绫诲瀷涓� : tinyint. 鍦ㄦ槧灏勫疄浣撶殑鏃跺�欏垯浼氬幓鎺塱s,鍦ㄥ疄浣撶被涓槧灏勬渶缁堢粨鏋滀负 xxx
     */
    private boolean entityBooleanColumnRemoveIsPrefix = false;
    /**
     * 鐢熸垚 <code>@RestController</code> 鎺у埗鍣�
     * <pre>
     *      <code>@Controller</code> -> <code>@RestController</code>
     * </pre>
     */
    private boolean restControllerStyle = false;
    /**
     * 椹煎嘲杞繛瀛楃
     * <pre>
     *      <code>@RequestMapping("/managerUserActionHistory")</code> -> <code>@RequestMapping("/manager-user-action-history")</code>
     * </pre>
     */
    private boolean controllerMappingHyphenStyle = false;

    /**
     * 鏄惁鐢熸垚瀹炰綋鏃讹紝鐢熸垚瀛楁娉ㄨВ
     */
    private boolean entityTableFieldAnnotationEnable = false;
    /**
     * 涔愯閿佸睘鎬у悕绉�
     */
    private String versionFieldName;

    /**
     * 閫昏緫鍒犻櫎灞炴�у悕绉�
     */
    private String logicDeleteFieldName;

    /**
     * 琛ㄥ～鍏呭瓧娈�
     */
    private List<TableFill> tableFillList = null;

    public StrategyConfig setDbColumnUnderline(boolean dbColumnUnderline) {
        DB_COLUMN_UNDERLINE = dbColumnUnderline;
        return this;
    }

    /**
     * <p>
     * 澶у啓鍛藉悕銆佸瓧娈电鍚堝ぇ鍐欏瓧姣嶆暟瀛椾笅鍒掔嚎鍛藉悕
     * </p>
     *
     * @param word 寰呭垽鏂瓧绗︿覆
     * @return
     */
    public boolean isCapitalModeNaming(String word) {
        return isCapitalMode && StringUtils.isCapitalMode(word);
    }

    /**
     * <p>
     * 琛ㄥ悕绉板寘鍚寚瀹氬墠缂�
     * </p>
     *
     * @param tableName 琛ㄥ悕绉�
     * @return
     */
    public boolean containsTablePrefix(String tableName) {
        if (null != tableName) {
            String[] tps = getTablePrefix();
            if (null != tps) {
                for (String tp : tps) {
                    if (tableName.contains(tp)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isCapitalMode() {
        return isCapitalMode;
    }

    public StrategyConfig setCapitalMode(boolean isCapitalMode) {
        this.isCapitalMode = isCapitalMode;
        return this;
    }

    public boolean isSkipView() {
        return skipView;
    }

    public StrategyConfig setSkipView(boolean skipView) {
        this.skipView = skipView;
        return this;
    }

    public NamingStrategy getNaming() {
        return naming;
    }

    public StrategyConfig setNaming(NamingStrategy naming) {
        this.naming = naming;
        return this;
    }

    public NamingStrategy getColumnNaming() {
        if (null == columnNaming) {
            // 鏈寚瀹氫互 naming 绛栫暐涓哄噯
            return naming;
        }
        return columnNaming;
    }

    public StrategyConfig setColumnNaming(NamingStrategy columnNaming) {
        this.columnNaming = columnNaming;
        return this;
    }

    public String[] getTablePrefix() {
        return tablePrefix;
    }

    public StrategyConfig setTablePrefix(String... tablePrefix) {
        this.tablePrefix = tablePrefix;
        return this;
    }

    public String getSuperEntityClass() {
        return superEntityClass;
    }

    public StrategyConfig setSuperEntityClass(String superEntityClass) {
        this.superEntityClass = superEntityClass;
        return this;
    }

    public boolean includeSuperEntityColumns(String fieldName) {
        if (null != superEntityColumns) {
            for (String column : superEntityColumns) {
                if (column.equals(fieldName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String[] getSuperEntityColumns() {
        return superEntityColumns;
    }

    public StrategyConfig setSuperEntityColumns(String... superEntityColumns) {
        this.superEntityColumns = superEntityColumns;
        return this;
    }

    public String getSuperMapperClass() {
        return superMapperClass;
    }

    public StrategyConfig setSuperMapperClass(String superMapperClass) {
        this.superMapperClass = superMapperClass;
        return this;
    }

    public String getSuperServiceClass() {
        return superServiceClass;
    }

    public StrategyConfig setSuperServiceClass(String superServiceClass) {
        this.superServiceClass = superServiceClass;
        return this;
    }

    public String getSuperServiceImplClass() {
        return superServiceImplClass;
    }

    public StrategyConfig setSuperServiceImplClass(String superServiceImplClass) {
        this.superServiceImplClass = superServiceImplClass;
        return this;
    }

    public String getSuperControllerClass() {
        return superControllerClass;
    }

    public StrategyConfig setSuperControllerClass(String superControllerClass) {
        this.superControllerClass = superControllerClass;
        return this;
    }

    public String[] getInclude() {
        return include;
    }

    public StrategyConfig setInclude(String... include) {
        this.include = include;
        return this;
    }

    public String[] getExclude() {
        return exclude;
    }

    public StrategyConfig setExclude(String... exclude) {
        this.exclude = exclude;
        return this;
    }

    public boolean isEntityColumnConstant() {
        return entityColumnConstant;
    }

    public StrategyConfig setEntityColumnConstant(boolean entityColumnConstant) {
        this.entityColumnConstant = entityColumnConstant;
        return this;
    }

    public boolean isEntityBuilderModel() {
        return entityBuilderModel;
    }

    public StrategyConfig setEntityBuilderModel(boolean entityBuilderModel) {
        this.entityBuilderModel = entityBuilderModel;
        return this;
    }

    public boolean isEntityLombokModel() {
        return entityLombokModel;
    }

    public StrategyConfig setEntityLombokModel(boolean entityLombokModel) {
        this.entityLombokModel = entityLombokModel;
        return this;
    }

    public boolean isEntityBooleanColumnRemoveIsPrefix() {
        return entityBooleanColumnRemoveIsPrefix;
    }

    public StrategyConfig setEntityBooleanColumnRemoveIsPrefix(boolean entityBooleanColumnRemoveIsPrefix) {
        this.entityBooleanColumnRemoveIsPrefix = entityBooleanColumnRemoveIsPrefix;
        return this;
    }

    public boolean isRestControllerStyle() {
        return restControllerStyle;
    }

    public StrategyConfig setRestControllerStyle(boolean restControllerStyle) {
        this.restControllerStyle = restControllerStyle;
        return this;
    }

    public boolean isControllerMappingHyphenStyle() {
        return controllerMappingHyphenStyle;
    }

    public StrategyConfig setControllerMappingHyphenStyle(boolean controllerMappingHyphenStyle) {
        this.controllerMappingHyphenStyle = controllerMappingHyphenStyle;
        return this;
    }

    public String getLogicDeleteFieldName() {
        return logicDeleteFieldName;
    }

    /**
     * 璁剧疆閫昏緫鍒犻櫎瀛楁
     *
     * @param logicDeleteFieldName 鏁版嵁搴撳瓧娈�
     * @return
     */
    public StrategyConfig setLogicDeleteFieldName(String logicDeleteFieldName) {
        this.logicDeleteFieldName = logicDeleteFieldName;
        return this;
    }

    public String getVersionFieldName() {
        return versionFieldName;
    }

    /**
     * 璁剧疆涔愯閿佸瓧娈�
     *
     * @param versionFieldName 鏁版嵁搴撳瓧娈�
     * @return
     */
    public StrategyConfig setVersionFieldName(String versionFieldName) {
        this.versionFieldName = versionFieldName;
        return this;
    }

    public List<TableFill> getTableFillList() {
        return tableFillList;
    }

    public StrategyConfig setTableFillList(List<TableFill> tableFillList) {
        this.tableFillList = tableFillList;
        return this;
    }

    public String[] getFieldPrefix() {
        return fieldPrefix;
    }

    public StrategyConfig setFieldPrefix(String[] fieldPrefix) {
        this.fieldPrefix = fieldPrefix;
        return this;
    }

    public StrategyConfig fieldPrefix(String... fieldPrefixs) {
        setFieldPrefix(fieldPrefixs);
        return this;
    }

    public StrategyConfig entityTableFieldAnnotationEnable(boolean isEnableAnnotation) {
        this.entityTableFieldAnnotationEnable = isEnableAnnotation;
        return this;
    }

    public boolean isEntityTableFieldAnnotationEnable() {
        return entityTableFieldAnnotationEnable;
    }
}
