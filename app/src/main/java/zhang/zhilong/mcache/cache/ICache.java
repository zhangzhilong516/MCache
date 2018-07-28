package zhang.zhilong.mcache.cache;

/**
 * @author: zhangzhilong
 * @date: 2018/7/28
 * @Description: 缓存
 */
public interface ICache {
    void put(String key, Object value);

    Object get(String key);

    boolean contains(String key);

    void remove(String key);

    void clear();
}
