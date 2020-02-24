package exceptions.pager;

import java.util.List;

public class FilteringPager {

    private final SimplePager dataSource;
    private final int pageSize;

    public FilteringPager(SimplePager dataSource, int pageSize) {
        this.dataSource = dataSource;
        this.pageSize = pageSize;
    }

    public List<Integer> getNextPage() {
        throw new RuntimeException("not implemented yet");
    }

    public List<Integer> getCurrentPage() {
        throw new RuntimeException("not implemented yet");
    }

    public List<Integer> getPreviousPage() {
        throw new RuntimeException("not implemented yet");
    }

}
