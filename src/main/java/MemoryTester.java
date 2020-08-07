import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.LinkedList;
import java.util.List;

public class MemoryTester {

    public static void main(String[] argv) {
        List<byte[]> blocks = new LinkedList<>();
        System.out.println("Testing available heap.");
        System.out.println("Total memory available:" + Runtime.getRuntime().maxMemory() / 1024 / 1024 + " MB");
        MemoryMXBean memBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage heapMemoryUsage = memBean.getHeapMemoryUsage();
        System.out.println("Heap memory (initial):" + heapMemoryUsage.getInit() / 1024 / 1024 + " MB");
        System.out.println("Heap memory (max):" + heapMemoryUsage.getMax() / 1024 / 1024 + " MB");
        System.out.println("Heap memory (committed):" + heapMemoryUsage.getCommitted() / 1024 / 1024 + " MB");
        System.out.println();
        System.out.println(". = 1M");
        System.out.println("................................................................ = 64M");
        int count = 0;
        while (true) {
            if (count % 64 == 0) {
                System.out.println();
                System.out.print(String.format("%06d MB  ", count));
            }
            blocks.add(new byte[1024 * 1024]);
            System.out.print(".");
            System.out.flush();
            count++;
        }
    }
}
