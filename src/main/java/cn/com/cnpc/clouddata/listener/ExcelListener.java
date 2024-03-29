package cn.com.cnpc.clouddata.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class ExcelListener extends AnalysisEventListener<Object> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelListener.class);
    /**
     * 自定义用于暂时存储data
     */
    private List<JSONObject> dataList = new ArrayList<>();

    /**
     * 导入表头
     */
    private Map<String, Integer> importHeads = new HashMap<>(16);


    /**
     * 这个每一条数据解析都会来调用
     */
    @Override
    public void invoke(Object data, AnalysisContext analysisContext) {
        String headStr = JSON.toJSONString(data);
        dataList.add(JSONObject.parseObject(headStr));
    }

    /**
     * 这里会一行行的返回头
     */
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        for (Integer key : headMap.keySet()) {
            if (importHeads.containsKey(headMap.get(key))) {
                continue;
            }
            importHeads.put(headMap.get(key), key);
        }
    }

    /**
     * 所有数据解析完成了 都会来调用
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        LOGGER.info("Excel解析完毕");
    }
}
