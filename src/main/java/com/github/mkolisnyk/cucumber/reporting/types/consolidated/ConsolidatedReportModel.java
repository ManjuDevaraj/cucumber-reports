package com.github.mkolisnyk.cucumber.reporting.types.consolidated;

public class ConsolidatedReportModel {
    private ConsolidatedItemInfo[] items;
    private String reportSuffix = "consolidated";
    private String title;
    private boolean useTableOfContents;
    private int rows = 1;
    private int cols = 1;
    public ConsolidatedReportModel(ConsolidatedItemInfo[] itemsValue,
            String reportSuffixValue,
            String titleValue,
            boolean useTableOfContentsValue) {
        super();
        this.items = itemsValue;
        this.title = titleValue;
        this.reportSuffix = reportSuffixValue;
        this.useTableOfContents = useTableOfContentsValue;
    }
    public ConsolidatedItemInfo[] getItems() {
        return items;
    }
    public String getTitle() {
        return title;
    }
    public String getReportSuffix() {
        return reportSuffix;
    }
    public boolean isUseTableOfContents() {
        return useTableOfContents;
    }
    public int getRows() {
        return rows;
    }
    public int getCols() {
        return cols;
    }
}
